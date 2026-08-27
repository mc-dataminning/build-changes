import javax.annotation.Nullable;

public final class li {
   public static final li a = a("all");
   public static final li b = a("texture", a);
   public static final li c = a("particle", b);
   public static final li d = a("end", a);
   public static final li e = a("bottom", d);
   public static final li f = a("top", d);
   public static final li g = a("front", a);
   public static final li h = a("back", a);
   public static final li i = a("side", a);
   public static final li j = a("north", i);
   public static final li k = a("south", i);
   public static final li l = a("east", i);
   public static final li m = a("west", i);
   public static final li n = a("up");
   public static final li o = a("down");
   public static final li p = a("cross");
   public static final li q = a("plant");
   public static final li r = a("wall", a);
   public static final li s = a("rail");
   public static final li t = a("wool");
   public static final li u = a("pattern");
   public static final li v = a("pane");
   public static final li w = a("edge");
   public static final li x = a("fan");
   public static final li y = a("stem");
   public static final li z = a("upperstem");
   public static final li A = a("crop");
   public static final li B = a("dirt");
   public static final li C = a("fire");
   public static final li D = a("lantern");
   public static final li E = a("platform");
   public static final li F = a("unsticky");
   public static final li G = a("torch");
   public static final li H = a("layer0");
   public static final li I = a("layer1");
   public static final li J = a("layer2");
   public static final li K = a("lit_log");
   public static final li L = a("candle");
   public static final li M = a("inside");
   public static final li N = a("content");
   public static final li O = a("inner_top");
   public static final li P = a("flowerbed");
   private final String Q;
   @Nullable
   private final li R;

   private static li a(String $$0) {
      return new li($$0, null);
   }

   private static li a(String $$0, li $$1) {
      return new li($$0, $$1);
   }

   private li(String $$0, @Nullable li $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public li b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
