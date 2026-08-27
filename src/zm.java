import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class zm implements wo<yh> {
   public static final zm.a a = new zm.a(0);
   public static final zm.a b = new zm.a(1);
   public static final zm.a c = new zm.a(2);
   public static final zm.a d = new zm.a(3);
   public static final zm.a e = new zm.a(4);
   public static final zm.a f = new zm.a(5);
   public static final zm.a g = new zm.a(6);
   public static final zm.a h = new zm.a(7);
   public static final zm.a i = new zm.a(8);
   public static final zm.a j = new zm.a(9);
   public static final zm.a k = new zm.a(10);
   public static final zm.a l = new zm.a(11);
   public static final zm.a m = new zm.a(12);
   public static final zm.a n = new zm.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final zm.a t;
   private final float u;

   public zm(zm.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public zm(ty $$0) {
      this.t = (zm.a)zm.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(ty $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public zm.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<zm.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
