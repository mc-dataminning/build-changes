import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class zt implements wu<yo> {
   public static final zt.a a = new zt.a(0);
   public static final zt.a b = new zt.a(1);
   public static final zt.a c = new zt.a(2);
   public static final zt.a d = new zt.a(3);
   public static final zt.a e = new zt.a(4);
   public static final zt.a f = new zt.a(5);
   public static final zt.a g = new zt.a(6);
   public static final zt.a h = new zt.a(7);
   public static final zt.a i = new zt.a(8);
   public static final zt.a j = new zt.a(9);
   public static final zt.a k = new zt.a(10);
   public static final zt.a l = new zt.a(11);
   public static final zt.a m = new zt.a(12);
   public static final zt.a n = new zt.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final zt.a t;
   private final float u;

   public zt(zt.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public zt(ue $$0) {
      this.t = (zt.a)zt.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public zt.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<zt.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
