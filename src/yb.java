import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class yb implements vd<ww> {
   public static final yb.a a = new yb.a(0);
   public static final yb.a b = new yb.a(1);
   public static final yb.a c = new yb.a(2);
   public static final yb.a d = new yb.a(3);
   public static final yb.a e = new yb.a(4);
   public static final yb.a f = new yb.a(5);
   public static final yb.a g = new yb.a(6);
   public static final yb.a h = new yb.a(7);
   public static final yb.a i = new yb.a(8);
   public static final yb.a j = new yb.a(9);
   public static final yb.a k = new yb.a(10);
   public static final yb.a l = new yb.a(11);
   public static final yb.a m = new yb.a(12);
   public static final int n = 0;
   public static final int o = 101;
   public static final int p = 102;
   public static final int q = 103;
   public static final int r = 104;
   private final yb.a s;
   private final float t;

   public yb(yb.a $$0, float $$1) {
      this.s = $$0;
      this.t = $$1;
   }

   public yb(so $$0) {
      this.s = (yb.a)yb.a.a.get($$0.readUnsignedByte());
      this.t = $$0.readFloat();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.s.b);
      $$0.a(this.t);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public yb.a a() {
      return this.s;
   }

   public float d() {
      return this.t;
   }

   public static class a {
      static final Int2ObjectMap<yb.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
