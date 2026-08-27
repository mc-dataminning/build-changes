import javax.annotation.Nullable;

public final class mx {
   public static final mx a = a("all");
   public static final mx b = a("texture", a);
   public static final mx c = a("particle", b);
   public static final mx d = a("end", a);
   public static final mx e = a("bottom", d);
   public static final mx f = a("top", d);
   public static final mx g = a("front", a);
   public static final mx h = a("back", a);
   public static final mx i = a("side", a);
   public static final mx j = a("north", i);
   public static final mx k = a("south", i);
   public static final mx l = a("east", i);
   public static final mx m = a("west", i);
   public static final mx n = a("up");
   public static final mx o = a("down");
   public static final mx p = a("cross");
   public static final mx q = a("plant");
   public static final mx r = a("wall", a);
   public static final mx s = a("rail");
   public static final mx t = a("wool");
   public static final mx u = a("pattern");
   public static final mx v = a("pane");
   public static final mx w = a("edge");
   public static final mx x = a("fan");
   public static final mx y = a("stem");
   public static final mx z = a("upperstem");
   public static final mx A = a("crop");
   public static final mx B = a("dirt");
   public static final mx C = a("fire");
   public static final mx D = a("lantern");
   public static final mx E = a("platform");
   public static final mx F = a("unsticky");
   public static final mx G = a("torch");
   public static final mx H = a("layer0");
   public static final mx I = a("layer1");
   public static final mx J = a("layer2");
   public static final mx K = a("lit_log");
   public static final mx L = a("candle");
   public static final mx M = a("inside");
   public static final mx N = a("content");
   public static final mx O = a("inner_top");
   public static final mx P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mx R;

   private static mx a(String $$0) {
      return new mx($$0, null);
   }

   private static mx a(String $$0, mx $$1) {
      return new mx($$0, $$1);
   }

   private mx(String $$0, @Nullable mx $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mx b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
