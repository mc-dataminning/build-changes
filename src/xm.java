import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record xm(xr d, @Nullable xi e, xp f, @Nullable ww g, xa h) {
   public static final MapCodec<xm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xr.a.fieldOf("link").forGetter(xm::k),
               xi.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xp.a.forGetter(xm::m),
               wy.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xa.a.optionalFieldOf("filter_mask", xa.c).forGetter(xm::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xm($$0x, (xi)$$1.orElse(null), $$2, (ww)$$3.orElse(null), $$4))
   );
   private static final UUID i = af.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xm a(String $$0) {
      return a(i, $$0);
   }

   public static xm a(UUID $$0, String $$1) {
      xp $$2 = xp.a($$1);
      xr $$3 = xr.a($$0);
      return new xm($$3, null, $$2, null, xa.c);
   }

   public xm a(ww $$0) {
      ww $$1 = !$$0.equals(ww.b(this.c())) ? $$0 : null;
      return new xm(this.d, this.e, this.f, $$1, this.h);
   }

   public xm a() {
      return this.g != null ? new xm(this.d, this.e, this.f, null, this.h) : this;
   }

   public xm a(xa $$0) {
      return this.h.equals($$0) ? this : new xm(this.d, this.e, this.f, this.g, $$0);
   }

   public xm a(boolean $$0) {
      return this.a($$0 ? this.h : xa.c);
   }

   public xm b() {
      xp $$0 = xp.a(this.c());
      xr $$1 = xr.a(this.g());
      return new xm($$1, null, $$0, this.g, this.h);
   }

   public static void a(azy.a $$0, xr $$1, xp $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azz $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public ww d() {
      return Objects.requireNonNullElseGet(this.g, () -> ww.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public xr k() {
      return this.d;
   }

   @Nullable
   public xi l() {
      return this.e;
   }

   public xp m() {
      return this.f;
   }

   @Nullable
   public ww n() {
      return this.g;
   }

   public xa o() {
      return this.h;
   }
}
