import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzk {
   private final GameProfile a;
   private final Supplier<grf> b;
   private dcr c = dcr.e;
   private int d;
   @Nullable
   private wy e;
   @Nullable
   private xp f;
   private xu g;

   public fzk(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<grf>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<grf> a(GameProfile $$0) {
      fgi $$1 = fgi.Q();
      grg $$2 = $$1.am();
      CompletableFuture<grf> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      grf $$5 = gqx.a($$0);
      return () -> {
         grf $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xp b() {
      return this.f;
   }

   public xu c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xp $$0) {
      this.f = $$0;
      this.g = $$0.a(cmy.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xu b(boolean $$0) {
      return $$0 ? xu.c : xu.b;
   }

   public dcr e() {
      return this.c;
   }

   protected void a(dcr $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public grf g() {
      return this.b.get();
   }

   @Nullable
   public exv h() {
      return fgi.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable wy $$0) {
      this.e = $$0;
   }

   @Nullable
   public wy i() {
      return this.e;
   }
}
