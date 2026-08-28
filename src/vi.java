import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;

public class vi implements ux {
   private final Deque<vi.b> a = new ArrayDeque<>();

   public vi() {
      this.a.addLast(new vi.d());
   }

   @Nullable
   public va d() {
      return this.a.getFirst().a();
   }

   protected int e() {
      return this.a.size() - 1;
   }

   private void a(va $$0) {
      this.a.getLast().a($$0);
   }

   @Override
   public ux.b a() {
      this.a(uc.b);
      return ux.b.a;
   }

   @Override
   public ux.b a(String $$0) {
      this.a(uy.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(byte $$0) {
      this.a(ty.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(short $$0) {
      this.a(ut.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(int $$0) {
      this.a(uf.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(long $$0) {
      this.a(ui.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(float $$0) {
      this.a(ud.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(double $$0) {
      this.a(ub.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(byte[] $$0) {
      this.a(new tx($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(int[] $$0) {
      this.a(new ue($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(long[] $$0) {
      this.a(new uh($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(vc<?> $$0, int $$1) {
      return ux.b.a;
   }

   @Override
   public ux.a b(vc<?> $$0, int $$1) {
      this.c($$0);
      return ux.a.a;
   }

   @Override
   public ux.a a(vc<?> $$0) {
      return ux.a.a;
   }

   @Override
   public ux.a a(vc<?> $$0, String $$1) {
      this.a.getLast().a($$1);
      this.c($$0);
      return ux.a.a;
   }

   private void c(vc<?> $$0) {
      if ($$0 == ug.a) {
         this.a.addLast(new vi.c());
      } else if ($$0 == ua.b) {
         this.a.addLast(new vi.a());
      }
   }

   @Override
   public ux.b b() {
      vi.b $$0 = this.a.removeLast();
      va $$1 = $$0.a();
      if ($$1 != null) {
         this.a.getLast().a($$1);
      }

      return ux.b.a;
   }

   @Override
   public ux.b b(vc<?> $$0) {
      this.c($$0);
      return ux.b.a;
   }

   static class a implements vi.b {
      private final ua a = new ua();
      private String b = "";

      @Override
      public void a(String $$0) {
         this.b = $$0;
      }

      @Override
      public void a(va $$0) {
         this.a.a(this.b, $$0);
      }

      @Override
      public va a() {
         return this.a;
      }
   }

   interface b {
      default void a(String $$0) {
      }

      void a(va var1);

      @Nullable
      va a();
   }

   static class c implements vi.b {
      private final ug a = new ug();

      @Override
      public void a(va $$0) {
         this.a.a($$0);
      }

      @Override
      public va a() {
         return this.a;
      }
   }

   static class d implements vi.b {
      @Nullable
      private va a;

      @Override
      public void a(va $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public va a() {
         return this.a;
      }
   }
}
