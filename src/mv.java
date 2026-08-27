import javax.annotation.Nullable;

public final class mv {
   public static final mv a = a("all");
   public static final mv b = a("texture", a);
   public static final mv c = a("particle", b);
   public static final mv d = a("end", a);
   public static final mv e = a("bottom", d);
   public static final mv f = a("top", d);
   public static final mv g = a("front", a);
   public static final mv h = a("back", a);
   public static final mv i = a("side", a);
   public static final mv j = a("north", i);
   public static final mv k = a("south", i);
   public static final mv l = a("east", i);
   public static final mv m = a("west", i);
   public static final mv n = a("up");
   public static final mv o = a("down");
   public static final mv p = a("cross");
   public static final mv q = a("plant");
   public static final mv r = a("wall", a);
   public static final mv s = a("rail");
   public static final mv t = a("wool");
   public static final mv u = a("pattern");
   public static final mv v = a("pane");
   public static final mv w = a("edge");
   public static final mv x = a("fan");
   public static final mv y = a("stem");
   public static final mv z = a("upperstem");
   public static final mv A = a("crop");
   public static final mv B = a("dirt");
   public static final mv C = a("fire");
   public static final mv D = a("lantern");
   public static final mv E = a("platform");
   public static final mv F = a("unsticky");
   public static final mv G = a("torch");
   public static final mv H = a("layer0");
   public static final mv I = a("layer1");
   public static final mv J = a("layer2");
   public static final mv K = a("lit_log");
   public static final mv L = a("candle");
   public static final mv M = a("inside");
   public static final mv N = a("content");
   public static final mv O = a("inner_top");
   public static final mv P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mv R;

   private static mv a(String $$0) {
      return new mv($$0, null);
   }

   private static mv a(String $$0, mv $$1) {
      return new mv($$0, $$1);
   }

   private mv(String $$0, @Nullable mv $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mv b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
