import javax.annotation.Nullable;

public final class ny {
   public static final ny a = a("all");
   public static final ny b = a("texture", a);
   public static final ny c = a("particle", b);
   public static final ny d = a("end", a);
   public static final ny e = a("bottom", d);
   public static final ny f = a("top", d);
   public static final ny g = a("front", a);
   public static final ny h = a("back", a);
   public static final ny i = a("side", a);
   public static final ny j = a("north", i);
   public static final ny k = a("south", i);
   public static final ny l = a("east", i);
   public static final ny m = a("west", i);
   public static final ny n = a("up");
   public static final ny o = a("down");
   public static final ny p = a("cross");
   public static final ny q = a("plant");
   public static final ny r = a("wall", a);
   public static final ny s = a("rail");
   public static final ny t = a("wool");
   public static final ny u = a("pattern");
   public static final ny v = a("pane");
   public static final ny w = a("edge");
   public static final ny x = a("fan");
   public static final ny y = a("stem");
   public static final ny z = a("upperstem");
   public static final ny A = a("crop");
   public static final ny B = a("dirt");
   public static final ny C = a("fire");
   public static final ny D = a("lantern");
   public static final ny E = a("platform");
   public static final ny F = a("unsticky");
   public static final ny G = a("torch");
   public static final ny H = a("layer0");
   public static final ny I = a("layer1");
   public static final ny J = a("layer2");
   public static final ny K = a("lit_log");
   public static final ny L = a("candle");
   public static final ny M = a("inside");
   public static final ny N = a("content");
   public static final ny O = a("inner_top");
   public static final ny P = a("flowerbed");
   private final String Q;
   @Nullable
   private final ny R;

   private static ny a(String $$0) {
      return new ny($$0, null);
   }

   private static ny a(String $$0, ny $$1) {
      return new ny($$0, $$1);
   }

   private ny(String $$0, @Nullable ny $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public ny b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
