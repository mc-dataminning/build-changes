import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class xv implements ux<wp> {
   public static final xv.a a = new xv.a(0);
   public static final xv.a b = new xv.a(1);
   public static final xv.a c = new xv.a(2);
   public static final xv.a d = new xv.a(3);
   public static final xv.a e = new xv.a(4);
   public static final xv.a f = new xv.a(5);
   public static final xv.a g = new xv.a(6);
   public static final xv.a h = new xv.a(7);
   public static final xv.a i = new xv.a(8);
   public static final xv.a j = new xv.a(9);
   public static final xv.a k = new xv.a(10);
   public static final xv.a l = new xv.a(11);
   public static final int m = 0;
   public static final int n = 101;
   public static final int o = 102;
   public static final int p = 103;
   public static final int q = 104;
   private final xv.a r;
   private final float s;

   public xv(xv.a $$0, float $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public xv(si $$0) {
      this.r = (xv.a)xv.a.a.get($$0.readUnsignedByte());
      this.s = $$0.readFloat();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.r.b);
      $$0.a(this.s);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public xv.a a() {
      return this.r;
   }

   public float d() {
      return this.s;
   }

   public static class a {
      static final Int2ObjectMap<xv.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
