import javax.annotation.Nullable;

public final class lk {
   public static final lk a = a("all");
   public static final lk b = a("texture", a);
   public static final lk c = a("particle", b);
   public static final lk d = a("end", a);
   public static final lk e = a("bottom", d);
   public static final lk f = a("top", d);
   public static final lk g = a("front", a);
   public static final lk h = a("back", a);
   public static final lk i = a("side", a);
   public static final lk j = a("north", i);
   public static final lk k = a("south", i);
   public static final lk l = a("east", i);
   public static final lk m = a("west", i);
   public static final lk n = a("up");
   public static final lk o = a("down");
   public static final lk p = a("cross");
   public static final lk q = a("plant");
   public static final lk r = a("wall", a);
   public static final lk s = a("rail");
   public static final lk t = a("wool");
   public static final lk u = a("pattern");
   public static final lk v = a("pane");
   public static final lk w = a("edge");
   public static final lk x = a("fan");
   public static final lk y = a("stem");
   public static final lk z = a("upperstem");
   public static final lk A = a("crop");
   public static final lk B = a("dirt");
   public static final lk C = a("fire");
   public static final lk D = a("lantern");
   public static final lk E = a("platform");
   public static final lk F = a("unsticky");
   public static final lk G = a("torch");
   public static final lk H = a("layer0");
   public static final lk I = a("layer1");
   public static final lk J = a("layer2");
   public static final lk K = a("lit_log");
   public static final lk L = a("candle");
   public static final lk M = a("inside");
   public static final lk N = a("content");
   public static final lk O = a("inner_top");
   public static final lk P = a("flowerbed");
   private final String Q;
   @Nullable
   private final lk R;

   private static lk a(String $$0) {
      return new lk($$0, null);
   }

   private static lk a(String $$0, lk $$1) {
      return new lk($$0, $$1);
   }

   private lk(String $$0, @Nullable lk $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public lk b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
