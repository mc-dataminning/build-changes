import javax.annotation.Nullable;

public final class oo {
   public static final oo a = a("all");
   public static final oo b = a("texture", a);
   public static final oo c = a("particle", b);
   public static final oo d = a("end", a);
   public static final oo e = a("bottom", d);
   public static final oo f = a("top", d);
   public static final oo g = a("front", a);
   public static final oo h = a("back", a);
   public static final oo i = a("side", a);
   public static final oo j = a("north", i);
   public static final oo k = a("south", i);
   public static final oo l = a("east", i);
   public static final oo m = a("west", i);
   public static final oo n = a("up");
   public static final oo o = a("down");
   public static final oo p = a("cross");
   public static final oo q = a("plant");
   public static final oo r = a("wall", a);
   public static final oo s = a("rail");
   public static final oo t = a("wool");
   public static final oo u = a("pattern");
   public static final oo v = a("pane");
   public static final oo w = a("edge");
   public static final oo x = a("fan");
   public static final oo y = a("stem");
   public static final oo z = a("upperstem");
   public static final oo A = a("crop");
   public static final oo B = a("dirt");
   public static final oo C = a("fire");
   public static final oo D = a("lantern");
   public static final oo E = a("platform");
   public static final oo F = a("unsticky");
   public static final oo G = a("torch");
   public static final oo H = a("layer0");
   public static final oo I = a("layer1");
   public static final oo J = a("layer2");
   public static final oo K = a("lit_log");
   public static final oo L = a("candle");
   public static final oo M = a("inside");
   public static final oo N = a("content");
   public static final oo O = a("inner_top");
   public static final oo P = a("flowerbed");
   private final String Q;
   @Nullable
   private final oo R;

   private static oo a(String $$0) {
      return new oo($$0, null);
   }

   private static oo a(String $$0, oo $$1) {
      return new oo($$0, $$1);
   }

   private oo(String $$0, @Nullable oo $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public oo b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
