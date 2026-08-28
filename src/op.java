import javax.annotation.Nullable;

public final class op {
   public static final op a = a("all");
   public static final op b = a("texture", a);
   public static final op c = a("particle", b);
   public static final op d = a("end", a);
   public static final op e = a("bottom", d);
   public static final op f = a("top", d);
   public static final op g = a("front", a);
   public static final op h = a("back", a);
   public static final op i = a("side", a);
   public static final op j = a("north", i);
   public static final op k = a("south", i);
   public static final op l = a("east", i);
   public static final op m = a("west", i);
   public static final op n = a("up");
   public static final op o = a("down");
   public static final op p = a("cross");
   public static final op q = a("plant");
   public static final op r = a("wall", a);
   public static final op s = a("rail");
   public static final op t = a("wool");
   public static final op u = a("pattern");
   public static final op v = a("pane");
   public static final op w = a("edge");
   public static final op x = a("fan");
   public static final op y = a("stem");
   public static final op z = a("upperstem");
   public static final op A = a("crop");
   public static final op B = a("dirt");
   public static final op C = a("fire");
   public static final op D = a("lantern");
   public static final op E = a("platform");
   public static final op F = a("unsticky");
   public static final op G = a("torch");
   public static final op H = a("layer0");
   public static final op I = a("layer1");
   public static final op J = a("layer2");
   public static final op K = a("lit_log");
   public static final op L = a("candle");
   public static final op M = a("inside");
   public static final op N = a("content");
   public static final op O = a("inner_top");
   public static final op P = a("flowerbed");
   private final String Q;
   @Nullable
   private final op R;

   private static op a(String $$0) {
      return new op($$0, null);
   }

   private static op a(String $$0, op $$1) {
      return new op($$0, $$1);
   }

   private op(String $$0, @Nullable op $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public op b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
