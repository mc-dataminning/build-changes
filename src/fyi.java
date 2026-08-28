import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyi {
   private final GameProfile a;
   private final Supplier<gqb> b;
   private dbx c = dbx.e;
   private int d;
   @Nullable
   private xp e;
   @Nullable
   private yg f;
   private yl g;

   public fyi(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gqb>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gqb> a(GameProfile $$0) {
      ffh $$1 = ffh.Q();
      gqc $$2 = $$1.am();
      CompletableFuture<gqb> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gqb $$5 = gpt.a($$0);
      return () -> {
         gqb $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yg b() {
      return this.f;
   }

   public yl c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(yg $$0) {
      this.f = $$0;
      this.g = $$0.a(cnc.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static yl b(boolean $$0) {
      return $$0 ? yl.c : yl.b;
   }

   public dbx e() {
      return this.c;
   }

   protected void a(dbx $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gqb g() {
      return this.b.get();
   }

   @Nullable
   public ews h() {
      return ffh.Q().r.M().e(this.a().getName());
   }

   public void a(@Nullable xp $$0) {
      this.e = $$0;
   }

   @Nullable
   public xp i() {
      return this.e;
   }
}
