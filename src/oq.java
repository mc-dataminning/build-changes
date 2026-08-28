import javax.annotation.Nullable;

public final class oq {
   public static final oq a = a("all");
   public static final oq b = a("texture", a);
   public static final oq c = a("particle", b);
   public static final oq d = a("end", a);
   public static final oq e = a("bottom", d);
   public static final oq f = a("top", d);
   public static final oq g = a("front", a);
   public static final oq h = a("back", a);
   public static final oq i = a("side", a);
   public static final oq j = a("north", i);
   public static final oq k = a("south", i);
   public static final oq l = a("east", i);
   public static final oq m = a("west", i);
   public static final oq n = a("up");
   public static final oq o = a("down");
   public static final oq p = a("cross");
   public static final oq q = a("cross_emissive");
   public static final oq r = a("plant");
   public static final oq s = a("wall", a);
   public static final oq t = a("rail");
   public static final oq u = a("wool");
   public static final oq v = a("pattern");
   public static final oq w = a("pane");
   public static final oq x = a("edge");
   public static final oq y = a("fan");
   public static final oq z = a("stem");
   public static final oq A = a("upperstem");
   public static final oq B = a("crop");
   public static final oq C = a("dirt");
   public static final oq D = a("fire");
   public static final oq E = a("lantern");
   public static final oq F = a("platform");
   public static final oq G = a("unsticky");
   public static final oq H = a("torch");
   public static final oq I = a("layer0");
   public static final oq J = a("layer1");
   public static final oq K = a("layer2");
   public static final oq L = a("lit_log");
   public static final oq M = a("candle");
   public static final oq N = a("inside");
   public static final oq O = a("content");
   public static final oq P = a("inner_top");
   public static final oq Q = a("flowerbed");
   private final String R;
   @Nullable
   private final oq S;

   private static oq a(String $$0) {
      return new oq($$0, null);
   }

   private static oq a(String $$0, oq $$1) {
      return new oq($$0, $$1);
   }

   private oq(String $$0, @Nullable oq $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public oq b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}
