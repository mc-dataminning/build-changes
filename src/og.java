import javax.annotation.Nullable;

public final class og {
   public static final og a = a("all");
   public static final og b = a("texture", a);
   public static final og c = a("particle", b);
   public static final og d = a("end", a);
   public static final og e = a("bottom", d);
   public static final og f = a("top", d);
   public static final og g = a("front", a);
   public static final og h = a("back", a);
   public static final og i = a("side", a);
   public static final og j = a("north", i);
   public static final og k = a("south", i);
   public static final og l = a("east", i);
   public static final og m = a("west", i);
   public static final og n = a("up");
   public static final og o = a("down");
   public static final og p = a("cross");
   public static final og q = a("plant");
   public static final og r = a("wall", a);
   public static final og s = a("rail");
   public static final og t = a("wool");
   public static final og u = a("pattern");
   public static final og v = a("pane");
   public static final og w = a("edge");
   public static final og x = a("fan");
   public static final og y = a("stem");
   public static final og z = a("upperstem");
   public static final og A = a("crop");
   public static final og B = a("dirt");
   public static final og C = a("fire");
   public static final og D = a("lantern");
   public static final og E = a("platform");
   public static final og F = a("unsticky");
   public static final og G = a("torch");
   public static final og H = a("layer0");
   public static final og I = a("layer1");
   public static final og J = a("layer2");
   public static final og K = a("lit_log");
   public static final og L = a("candle");
   public static final og M = a("inside");
   public static final og N = a("content");
   public static final og O = a("inner_top");
   public static final og P = a("flowerbed");
   private final String Q;
   @Nullable
   private final og R;

   private static og a(String $$0) {
      return new og($$0, null);
   }

   private static og a(String $$0, og $$1) {
      return new og($$0, $$1);
   }

   private og(String $$0, @Nullable og $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public og b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
