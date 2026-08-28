import javax.annotation.Nullable;

public final class on {
   public static final on a = a("all");
   public static final on b = a("texture", a);
   public static final on c = a("particle", b);
   public static final on d = a("end", a);
   public static final on e = a("bottom", d);
   public static final on f = a("top", d);
   public static final on g = a("front", a);
   public static final on h = a("back", a);
   public static final on i = a("side", a);
   public static final on j = a("north", i);
   public static final on k = a("south", i);
   public static final on l = a("east", i);
   public static final on m = a("west", i);
   public static final on n = a("up");
   public static final on o = a("down");
   public static final on p = a("cross");
   public static final on q = a("plant");
   public static final on r = a("wall", a);
   public static final on s = a("rail");
   public static final on t = a("wool");
   public static final on u = a("pattern");
   public static final on v = a("pane");
   public static final on w = a("edge");
   public static final on x = a("fan");
   public static final on y = a("stem");
   public static final on z = a("upperstem");
   public static final on A = a("crop");
   public static final on B = a("dirt");
   public static final on C = a("fire");
   public static final on D = a("lantern");
   public static final on E = a("platform");
   public static final on F = a("unsticky");
   public static final on G = a("torch");
   public static final on H = a("layer0");
   public static final on I = a("layer1");
   public static final on J = a("layer2");
   public static final on K = a("lit_log");
   public static final on L = a("candle");
   public static final on M = a("inside");
   public static final on N = a("content");
   public static final on O = a("inner_top");
   public static final on P = a("flowerbed");
   private final String Q;
   @Nullable
   private final on R;

   private static on a(String $$0) {
      return new on($$0, null);
   }

   private static on a(String $$0, on $$1) {
      return new on($$0, $$1);
   }

   private on(String $$0, @Nullable on $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public on b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}
