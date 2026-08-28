import javax.annotation.Nullable;

public final class ou {
   public static final ou a = a("all");
   public static final ou b = a("texture", a);
   public static final ou c = a("particle", b);
   public static final ou d = a("end", a);
   public static final ou e = a("bottom", d);
   public static final ou f = a("top", d);
   public static final ou g = a("front", a);
   public static final ou h = a("back", a);
   public static final ou i = a("side", a);
   public static final ou j = a("north", i);
   public static final ou k = a("south", i);
   public static final ou l = a("east", i);
   public static final ou m = a("west", i);
   public static final ou n = a("up");
   public static final ou o = a("down");
   public static final ou p = a("cross");
   public static final ou q = a("plant");
   public static final ou r = a("wall", a);
   public static final ou s = a("rail");
   public static final ou t = a("wool");
   public static final ou u = a("pattern");
   public static final ou v = a("pane");
   public static final ou w = a("edge");
   public static final ou x = a("fan");
   public static final ou y = a("stem");
   public static final ou z = a("upperstem");
   public static final ou A = a("crop");
   public static final ou B = a("dirt");
   public static final ou C = a("fire");
   public static final ou D = a("lantern");
   public static final ou E = a("platform");
   public static final ou F = a("unsticky");
   public static final ou G = a("torch");
   public static final ou H = a("layer0");
   public static final ou I = a("layer1");
   public static final ou J = a("layer2");
   public static final ou K = a("lit_log");
   public static final ou L = a("candle");
   public static final ou M = a("inside");
   public static final ou N = a("content");
   public static final ou O = a("inner_top");
   public static final ou P = a("flowerbed");
   private final String Q;
   @Nullable
   private final ou R;

   private static ou a(String $$0) {
      return new ou($$0, null);
   }

   private static ou a(String $$0, ou $$1) {
      return new ou($$0, $$1);
   }

   private ou(String $$0, @Nullable ou $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public ou b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
