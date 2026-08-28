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

public record xf(xk d, @Nullable xb e, xi f, @Nullable wp g, wt h) {
   public static final MapCodec<xf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xk.a.fieldOf("link").forGetter(xf::k),
               xb.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xi.a.forGetter(xf::m),
               wr.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               wt.a.optionalFieldOf("filter_mask", wt.c).forGetter(xf::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xf($$0x, (xb)$$1.orElse(null), $$2, (wp)$$3.orElse(null), $$4))
   );
   private static final UUID i = af.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xf a(String $$0) {
      return a(i, $$0);
   }

   public static xf a(UUID $$0, String $$1) {
      xi $$2 = xi.a($$1);
      xk $$3 = xk.a($$0);
      return new xf($$3, null, $$2, null, wt.c);
   }

   public xf a(wp $$0) {
      wp $$1 = !$$0.equals(wp.b(this.c())) ? $$0 : null;
      return new xf(this.d, this.e, this.f, $$1, this.h);
   }

   public xf a() {
      return this.g != null ? new xf(this.d, this.e, this.f, null, this.h) : this;
   }

   public xf a(wt $$0) {
      return this.h.equals($$0) ? this : new xf(this.d, this.e, this.f, this.g, $$0);
   }

   public xf a(boolean $$0) {
      return this.a($$0 ? this.h : wt.c);
   }

   public xf b() {
      xi $$0 = xi.a(this.c());
      xk $$1 = xk.a(this.g());
      return new xf($$1, null, $$0, this.g, this.h);
   }

   public static void a(azl.a $$0, xk $$1, xi $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azm $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wp d() {
      return Objects.requireNonNullElseGet(this.g, () -> wp.b(this.c()));
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

   public xk k() {
      return this.d;
   }

   @Nullable
   public xb l() {
      return this.e;
   }

   public xi m() {
      return this.f;
   }

   @Nullable
   public wp n() {
      return this.g;
   }

   public wt o() {
      return this.h;
   }
}
