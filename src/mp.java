import javax.annotation.Nullable;

public final class mp {
   public static final mp a = a("all");
   public static final mp b = a("texture", a);
   public static final mp c = a("particle", b);
   public static final mp d = a("end", a);
   public static final mp e = a("bottom", d);
   public static final mp f = a("top", d);
   public static final mp g = a("front", a);
   public static final mp h = a("back", a);
   public static final mp i = a("side", a);
   public static final mp j = a("north", i);
   public static final mp k = a("south", i);
   public static final mp l = a("east", i);
   public static final mp m = a("west", i);
   public static final mp n = a("up");
   public static final mp o = a("down");
   public static final mp p = a("cross");
   public static final mp q = a("plant");
   public static final mp r = a("wall", a);
   public static final mp s = a("rail");
   public static final mp t = a("wool");
   public static final mp u = a("pattern");
   public static final mp v = a("pane");
   public static final mp w = a("edge");
   public static final mp x = a("fan");
   public static final mp y = a("stem");
   public static final mp z = a("upperstem");
   public static final mp A = a("crop");
   public static final mp B = a("dirt");
   public static final mp C = a("fire");
   public static final mp D = a("lantern");
   public static final mp E = a("platform");
   public static final mp F = a("unsticky");
   public static final mp G = a("torch");
   public static final mp H = a("layer0");
   public static final mp I = a("layer1");
   public static final mp J = a("layer2");
   public static final mp K = a("lit_log");
   public static final mp L = a("candle");
   public static final mp M = a("inside");
   public static final mp N = a("content");
   public static final mp O = a("inner_top");
   public static final mp P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mp R;

   private static mp a(String $$0) {
      return new mp($$0, null);
   }

   private static mp a(String $$0, mp $$1) {
      return new mp($$0, $$1);
   }

   private mp(String $$0, @Nullable mp $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mp b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
