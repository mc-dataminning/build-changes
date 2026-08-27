import java.util.function.Function;
import javax.annotation.Nullable;

public class zt implements uo<zb> {
   private final int a;
   private final zt.a b;
   private final boolean c;
   static final zt.a d = new zt.a() {
      @Override
      public zt.b a() {
         return zt.b.b;
      }

      @Override
      public void a(zt.c $$0) {
         $$0.a();
      }

      @Override
      public void a(sf $$0) {
      }
   };

   private zt(int $$0, boolean $$1, zt.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static zt a(bfj $$0, boolean $$1) {
      return new zt($$0.af(), $$1, d);
   }

   public static zt a(bfj $$0, boolean $$1, bdw $$2) {
      return new zt($$0.af(), $$1, new zt.d($$2));
   }

   public static zt a(bfj $$0, boolean $$1, bdw $$2, eei $$3) {
      return new zt($$0.af(), $$1, new zt.e($$2, $$3));
   }

   public zt(sf $$0) {
      this.a = $$0.m();
      zt.b $$1 = $$0.b(zt.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.writeBoolean(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Nullable
   public bfj a(aif $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(zt.c $$0) {
      this.b.a($$0);
   }

   interface a {
      zt.b a();

      void a(zt.c var1);

      void a(sf var1);
   }

   static enum b {
      a(zt.d::new),
      b($$0 -> zt.d),
      c(zt.e::new);

      final Function<sf, zt.a> d;

      private b(Function<sf, zt.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bdw var1);

      void a(bdw var1, eei var2);

      void a();
   }

   static class d implements zt.a {
      private final bdw a;

      d(bdw $$0) {
         this.a = $$0;
      }

      private d(sf $$0) {
         this.a = $$0.b(bdw.class);
      }

      @Override
      public zt.b a() {
         return zt.b.a;
      }

      @Override
      public void a(zt.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(sf $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements zt.a {
      private final bdw a;
      private final eei b;

      e(bdw $$0, eei $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(sf $$0) {
         this.b = new eei((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bdw.class);
      }

      @Override
      public zt.b a() {
         return zt.b.c;
      }

      @Override
      public void a(zt.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeFloat((float)this.b.c);
         $$0.writeFloat((float)this.b.d);
         $$0.writeFloat((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
