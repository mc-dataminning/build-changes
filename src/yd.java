import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class yd implements vf<wy> {
   public static final yd.a a = new yd.a(0);
   public static final yd.a b = new yd.a(1);
   public static final yd.a c = new yd.a(2);
   public static final yd.a d = new yd.a(3);
   public static final yd.a e = new yd.a(4);
   public static final yd.a f = new yd.a(5);
   public static final yd.a g = new yd.a(6);
   public static final yd.a h = new yd.a(7);
   public static final yd.a i = new yd.a(8);
   public static final yd.a j = new yd.a(9);
   public static final yd.a k = new yd.a(10);
   public static final yd.a l = new yd.a(11);
   public static final yd.a m = new yd.a(12);
   public static final int n = 0;
   public static final int o = 101;
   public static final int p = 102;
   public static final int q = 103;
   public static final int r = 104;
   private final yd.a s;
   private final float t;

   public yd(yd.a $$0, float $$1) {
      this.s = $$0;
      this.t = $$1;
   }

   public yd(sq $$0) {
      this.s = (yd.a)yd.a.a.get($$0.readUnsignedByte());
      this.t = $$0.readFloat();
   }

   @Override
   public void a(sq $$0) {
      $$0.k(this.s.b);
      $$0.a(this.t);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public yd.a a() {
      return this.s;
   }

   public float d() {
      return this.t;
   }

   public static class a {
      static final Int2ObjectMap<yd.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
