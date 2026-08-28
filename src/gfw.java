import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfw {
   private final GameProfile a;
   private final Supplier<hcm> b;
   private dhf c = dhf.e;
   private int d;
   @Nullable
   private xv e;
   @Nullable
   private ym f;
   private yr g;
   private int h;

   public gfw(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<hcm>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hcm> a(GameProfile $$0) {
      fmg $$1 = fmg.Q();
      hcn $$2 = $$1.an();
      CompletableFuture<hcm> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hcm $$5 = hcd.a($$0);
      return () -> {
         hcm $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public ym b() {
      return this.f;
   }

   public yr c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(ym $$0) {
      this.f = $$0;
      this.g = $$0.a(cqa.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yr b(boolean $$0) {
      return $$0 ? yr.c : yr.b;
   }

   public dhf e() {
      return this.c;
   }

   protected void a(dhf $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hcm g() {
      return this.b.get();
   }

   @Nullable
   public fcy h() {
      return fmg.Q().s.Q().e(this.a().getName());
   }

   public void a(@Nullable xv $$0) {
      this.e = $$0;
   }

   @Nullable
   public xv i() {
      return this.e;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public int j() {
      return this.h;
   }
}
