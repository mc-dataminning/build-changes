import javax.annotation.Nullable;

public final class ok {
   public static final ok a = a("all");
   public static final ok b = a("texture", a);
   public static final ok c = a("particle", b);
   public static final ok d = a("end", a);
   public static final ok e = a("bottom", d);
   public static final ok f = a("top", d);
   public static final ok g = a("front", a);
   public static final ok h = a("back", a);
   public static final ok i = a("side", a);
   public static final ok j = a("north", i);
   public static final ok k = a("south", i);
   public static final ok l = a("east", i);
   public static final ok m = a("west", i);
   public static final ok n = a("up");
   public static final ok o = a("down");
   public static final ok p = a("cross");
   public static final ok q = a("plant");
   public static final ok r = a("wall", a);
   public static final ok s = a("rail");
   public static final ok t = a("wool");
   public static final ok u = a("pattern");
   public static final ok v = a("pane");
   public static final ok w = a("edge");
   public static final ok x = a("fan");
   public static final ok y = a("stem");
   public static final ok z = a("upperstem");
   public static final ok A = a("crop");
   public static final ok B = a("dirt");
   public static final ok C = a("fire");
   public static final ok D = a("lantern");
   public static final ok E = a("platform");
   public static final ok F = a("unsticky");
   public static final ok G = a("torch");
   public static final ok H = a("layer0");
   public static final ok I = a("layer1");
   public static final ok J = a("layer2");
   public static final ok K = a("lit_log");
   public static final ok L = a("candle");
   public static final ok M = a("inside");
   public static final ok N = a("content");
   public static final ok O = a("inner_top");
   public static final ok P = a("flowerbed");
   private final String Q;
   @Nullable
   private final ok R;

   private static ok a(String $$0) {
      return new ok($$0, null);
   }

   private static ok a(String $$0, ok $$1) {
      return new ok($$0, $$1);
   }

   private ok(String $$0, @Nullable ok $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public ok b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
