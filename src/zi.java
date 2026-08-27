import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class zi implements wk<yd> {
   public static final zi.a a = new zi.a(0);
   public static final zi.a b = new zi.a(1);
   public static final zi.a c = new zi.a(2);
   public static final zi.a d = new zi.a(3);
   public static final zi.a e = new zi.a(4);
   public static final zi.a f = new zi.a(5);
   public static final zi.a g = new zi.a(6);
   public static final zi.a h = new zi.a(7);
   public static final zi.a i = new zi.a(8);
   public static final zi.a j = new zi.a(9);
   public static final zi.a k = new zi.a(10);
   public static final zi.a l = new zi.a(11);
   public static final zi.a m = new zi.a(12);
   public static final zi.a n = new zi.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final zi.a t;
   private final float u;

   public zi(zi.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public zi(tu $$0) {
      this.t = (zi.a)zi.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(tu $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public zi.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<zi.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
