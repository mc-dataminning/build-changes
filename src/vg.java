import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;

public class vg implements uv {
   private final Deque<vg.b> a = new ArrayDeque<>();

   public vg() {
      this.a.addLast(new vg.d());
   }

   @Nullable
   public uy d() {
      return this.a.getFirst().a();
   }

   protected int e() {
      return this.a.size() - 1;
   }

   private void a(uy $$0) {
      this.a.getLast().a($$0);
   }

   @Override
   public uv.b a() {
      this.a(ub.b);
      return uv.b.a;
   }

   @Override
   public uv.b a(String $$0) {
      this.a(uw.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(byte $$0) {
      this.a(tx.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(short $$0) {
      this.a(us.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(int $$0) {
      this.a(ue.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(long $$0) {
      this.a(uh.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(float $$0) {
      this.a(uc.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(double $$0) {
      this.a(ua.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(byte[] $$0) {
      this.a(new tw($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(int[] $$0) {
      this.a(new ud($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(long[] $$0) {
      this.a(new ug($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(va<?> $$0, int $$1) {
      return uv.b.a;
   }

   @Override
   public uv.a b(va<?> $$0, int $$1) {
      this.c($$0);
      return uv.a.a;
   }

   @Override
   public uv.a a(va<?> $$0) {
      return uv.a.a;
   }

   @Override
   public uv.a a(va<?> $$0, String $$1) {
      this.a.getLast().a($$1);
      this.c($$0);
      return uv.a.a;
   }

   private void c(va<?> $$0) {
      if ($$0 == uf.a) {
         this.a.addLast(new vg.c());
      } else if ($$0 == tz.b) {
         this.a.addLast(new vg.a());
      }
   }

   @Override
   public uv.b b() {
      vg.b $$0 = this.a.removeLast();
      uy $$1 = $$0.a();
      if ($$1 != null) {
         this.a.getLast().a($$1);
      }

      return uv.b.a;
   }

   @Override
   public uv.b b(va<?> $$0) {
      this.c($$0);
      return uv.b.a;
   }

   static class a implements vg.b {
      private final tz a = new tz();
      private String b = "";

      @Override
      public void a(String $$0) {
         this.b = $$0;
      }

      @Override
      public void a(uy $$0) {
         this.a.a(this.b, $$0);
      }

      @Override
      public uy a() {
         return this.a;
      }
   }

   interface b {
      default void a(String $$0) {
      }

      void a(uy var1);

      @Nullable
      uy a();
   }

   static class c implements vg.b {
      private final uf a = new uf();

      @Override
      public void a(uy $$0) {
         this.a.a($$0);
      }

      @Override
      public uy a() {
         return this.a;
      }
   }

   static class d implements vg.b {
      @Nullable
      private uy a;

      @Override
      public void a(uy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public uy a() {
         return this.a;
      }
   }
}
