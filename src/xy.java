import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class xy implements va<ws> {
   public static final xy.a a = new xy.a(0);
   public static final xy.a b = new xy.a(1);
   public static final xy.a c = new xy.a(2);
   public static final xy.a d = new xy.a(3);
   public static final xy.a e = new xy.a(4);
   public static final xy.a f = new xy.a(5);
   public static final xy.a g = new xy.a(6);
   public static final xy.a h = new xy.a(7);
   public static final xy.a i = new xy.a(8);
   public static final xy.a j = new xy.a(9);
   public static final xy.a k = new xy.a(10);
   public static final xy.a l = new xy.a(11);
   public static final int m = 0;
   public static final int n = 101;
   public static final int o = 102;
   public static final int p = 103;
   public static final int q = 104;
   private final xy.a r;
   private final float s;

   public xy(xy.a $$0, float $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public xy(sl $$0) {
      this.r = (xy.a)xy.a.a.get($$0.readUnsignedByte());
      this.s = $$0.readFloat();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.r.b);
      $$0.a(this.s);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public xy.a a() {
      return this.r;
   }

   public float d() {
      return this.s;
   }

   public static class a {
      static final Int2ObjectMap<xy.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
