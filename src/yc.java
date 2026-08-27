import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class yc implements ve<wx> {
   public static final yc.a a = new yc.a(0);
   public static final yc.a b = new yc.a(1);
   public static final yc.a c = new yc.a(2);
   public static final yc.a d = new yc.a(3);
   public static final yc.a e = new yc.a(4);
   public static final yc.a f = new yc.a(5);
   public static final yc.a g = new yc.a(6);
   public static final yc.a h = new yc.a(7);
   public static final yc.a i = new yc.a(8);
   public static final yc.a j = new yc.a(9);
   public static final yc.a k = new yc.a(10);
   public static final yc.a l = new yc.a(11);
   public static final yc.a m = new yc.a(12);
   public static final yc.a n = new yc.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final yc.a t;
   private final float u;

   public yc(yc.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public yc(so $$0) {
      this.t = (yc.a)yc.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public yc.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<yc.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
