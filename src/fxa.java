import java.util.List;
import javax.annotation.Nullable;

public class fxa extends fui {
   private static final int a = 310;
   private static final int b = 25;
   private static final wo c = wo.c("menu.server_links.title");
   private final fui d;
   @Nullable
   private fxa.a s;
   final fse u = new fse(this);
   final alm v;

   public fxa(fui $$0, alm $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aR_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fxa.a(this.m, this.n, this));
      this.u.b(fop.a(wn.k, $$0 -> this.aO_()).a(200).a());
      this.u.a($$1 -> {
         fon var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.n, this.u);
      }
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   static class a extends fow<fxa.b> {
      public a(flh $$0, int $$1, fxa $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fxa.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fse $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aH_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fow.a<fxa.b> {
      final fon a;

      b(fui $$0, alm.a $$1) {
         this.a = fop.a($$1.a(), ftf.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fqn> aH_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fsl> b() {
         return List.of(this.a);
      }
   }
}
