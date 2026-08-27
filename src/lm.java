import javax.annotation.Nullable;

public final class lm {
   public static final lm a = a("all");
   public static final lm b = a("texture", a);
   public static final lm c = a("particle", b);
   public static final lm d = a("end", a);
   public static final lm e = a("bottom", d);
   public static final lm f = a("top", d);
   public static final lm g = a("front", a);
   public static final lm h = a("back", a);
   public static final lm i = a("side", a);
   public static final lm j = a("north", i);
   public static final lm k = a("south", i);
   public static final lm l = a("east", i);
   public static final lm m = a("west", i);
   public static final lm n = a("up");
   public static final lm o = a("down");
   public static final lm p = a("cross");
   public static final lm q = a("plant");
   public static final lm r = a("wall", a);
   public static final lm s = a("rail");
   public static final lm t = a("wool");
   public static final lm u = a("pattern");
   public static final lm v = a("pane");
   public static final lm w = a("edge");
   public static final lm x = a("fan");
   public static final lm y = a("stem");
   public static final lm z = a("upperstem");
   public static final lm A = a("crop");
   public static final lm B = a("dirt");
   public static final lm C = a("fire");
   public static final lm D = a("lantern");
   public static final lm E = a("platform");
   public static final lm F = a("unsticky");
   public static final lm G = a("torch");
   public static final lm H = a("layer0");
   public static final lm I = a("layer1");
   public static final lm J = a("layer2");
   public static final lm K = a("lit_log");
   public static final lm L = a("candle");
   public static final lm M = a("inside");
   public static final lm N = a("content");
   public static final lm O = a("inner_top");
   public static final lm P = a("flowerbed");
   private final String Q;
   @Nullable
   private final lm R;

   private static lm a(String $$0) {
      return new lm($$0, null);
   }

   private static lm a(String $$0, lm $$1) {
      return new lm($$0, $$1);
   }

   private lm(String $$0, @Nullable lm $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public lm b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
