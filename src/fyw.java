import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyw {
   private final GameProfile a;
   private final Supplier<gqq> b;
   private dcd c = dcd.e;
   private int d;
   @Nullable
   private wu e;
   @Nullable
   private xl f;
   private xq g;

   public fyw(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gqq>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gqq> a(GameProfile $$0) {
      ffw $$1 = ffw.Q();
      gqr $$2 = $$1.am();
      CompletableFuture<gqq> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gqq $$5 = gqi.a($$0);
      return () -> {
         gqq $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public xl b() {
      return this.f;
   }

   public xq c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(xl $$0) {
      this.f = $$0;
      this.g = $$0.a(cmo.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static xq b(boolean $$0) {
      return $$0 ? xq.c : xq.b;
   }

   public dcd e() {
      return this.c;
   }

   protected void a(dcd $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gqq g() {
      return this.b.get();
   }

   @Nullable
   public exg h() {
      return ffw.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable wu $$0) {
      this.e = $$0;
   }

   @Nullable
   public wu i() {
      return this.e;
   }
}
