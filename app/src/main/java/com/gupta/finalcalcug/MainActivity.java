package com.gupta.finalcalcug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.Float;
import java.lang.String;

import static java.lang.Float.parseFloat;
import static java.lang.String.valueOf;


public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,zero,dot,clear;
    private TextView rate,money,quantity;
    private ImageButton equals,equals2;
    float a,res1,res2,c ,b=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIviews();

        
        rate.setOnClickListener((View v) -> {
            rate.setText("");
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText(rate.getText().toString()+"0");
            }
        });
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"1");
                }
            });
            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"2");
                }
            });
            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"3");
                }
            });
            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"4");
                }
            });
            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"5");
                }
            });
            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"6");
                }
            });
            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"7");
                }
            });
            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"8");
                }
            });
            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+"9");
                }
            });
            dot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText(rate.getText().toString()+".");
                }
            });
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rate.setText("");
                }
            });
        });
        //money
        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                money.setText("");
                zero.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"0");
                    }
                });
                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"1");
                    }
                });
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"2");
                    }
                });
                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"3");
                    }
                });
                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"4");
                    }
                });
                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"5");
                    }
                });
                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"6");
                    }
                });
                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(String.format("%s7", money.getText().toString()));
                    }
                });
                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"8");
                    }
                });
                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+"9");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText(money.getText().toString()+".");
                    }
                });
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.setText("");
                    }
                });
            }
        });
        //quantity
        quantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity.setText("");
                zero.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"0");
                    }
                });
                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"1");
                    }
                });
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"2");
                    }
                });
                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"3");
                    }
                });
                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"4");
                    }
                });
                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"5");
                    }
                });
                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"6");
                    }
                });
                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"7");
                    }
                });
                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"8");
                    }
                });
                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+"9");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        quantity.setText(quantity.getText().toString()+".");
                    }
                });
                clear.setOnClickListener(v1 -> quantity.setText(""));
            }
        });



        // assigning value of results.
    equals.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a= Float.parseFloat(valueOf(money.getText()));
            b= parseFloat(valueOf(rate.getText()));
            res1 = (a) * (1000 / b);
            final String s = Float.toString(res1);
            quantity.setText(s);
            }
        });

    equals2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            b= parseFloat(valueOf(rate.getText()));
            c= parseFloat(String.valueOf(quantity));
            res2= (c)*(b/1000);
            final String s2 = Float.toString(res2);
            money.setText(s2);
            }
        });



    }
    private void setupUIviews(){
        zero=(Button)findViewById(R.id.btnzero);
        one= (Button)findViewById(R.id.btn1);
        two= (Button)findViewById(R.id.btn2);
        three= (Button)findViewById(R.id.btn3);
        four= findViewById(R.id.btn4);
        five= (Button)findViewById(R.id.btn5);
        six= (Button)findViewById(R.id.btn6);
        seven= (Button)findViewById(R.id.btn7);
        eight= (Button)findViewById(R.id.btn8);
        nine= (Button)findViewById(R.id.btn9);
        dot= (Button)findViewById(R.id.btndot);
        clear= (Button)findViewById(R.id.btnclr);
        rate= (TextView) findViewById(R.id.rate);
        money= (TextView) findViewById(R.id.money);
        quantity= (TextView) findViewById(R.id.quantity);
        equals = (ImageButton)findViewById(R.id.equal);
        equals2= (ImageButton)findViewById(R.id.equal2);

}

}