import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class vx implements uo<ur> {
   public static final vx.a a = new vx.a(0);
   public static final vx.a b = new vx.a(1);
   public static final vx.a c = new vx.a(2);
   public static final vx.a d = new vx.a(3);
   public static final vx.a e = new vx.a(4);
   public static final vx.a f = new vx.a(5);
   public static final vx.a g = new vx.a(6);
   public static final vx.a h = new vx.a(7);
   public static final vx.a i = new vx.a(8);
   public static final vx.a j = new vx.a(9);
   public static final vx.a k = new vx.a(10);
   public static final vx.a l = new vx.a(11);
   public static final int m = 0;
   public static final int n = 101;
   public static final int o = 102;
   public static final int p = 103;
   public static final int q = 104;
   private final vx.a r;
   private final float s;

   public vx(vx.a $$0, float $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public vx(sf $$0) {
      this.r = (vx.a)vx.a.a.get($$0.readUnsignedByte());
      this.s = $$0.readFloat();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.r.b);
      $$0.writeFloat(this.s);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public vx.a a() {
      return this.r;
   }

   public float c() {
      return this.s;
   }

   public static class a {
      static final Int2ObjectMap<vx.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
