import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class yz implements wb<xu> {
   public static final yz.a a = new yz.a(0);
   public static final yz.a b = new yz.a(1);
   public static final yz.a c = new yz.a(2);
   public static final yz.a d = new yz.a(3);
   public static final yz.a e = new yz.a(4);
   public static final yz.a f = new yz.a(5);
   public static final yz.a g = new yz.a(6);
   public static final yz.a h = new yz.a(7);
   public static final yz.a i = new yz.a(8);
   public static final yz.a j = new yz.a(9);
   public static final yz.a k = new yz.a(10);
   public static final yz.a l = new yz.a(11);
   public static final yz.a m = new yz.a(12);
   public static final yz.a n = new yz.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final yz.a t;
   private final float u;

   public yz(yz.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public yz(tl $$0) {
      this.t = (yz.a)yz.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public yz.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<yz.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
