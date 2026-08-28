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

public record xo(xt d, @Nullable xk e, xr f, @Nullable wy g, xc h) {
   public static final MapCodec<xo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xt.a.fieldOf("link").forGetter(xo::k),
               xk.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xr.a.forGetter(xo::m),
               xa.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xc.a.optionalFieldOf("filter_mask", xc.c).forGetter(xo::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xo($$0x, (xk)$$1.orElse(null), $$2, (wy)$$3.orElse(null), $$4))
   );
   private static final UUID i = ag.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xo a(String $$0) {
      return a(i, $$0);
   }

   public static xo a(UUID $$0, String $$1) {
      xr $$2 = xr.a($$1);
      xt $$3 = xt.a($$0);
      return new xo($$3, null, $$2, null, xc.c);
   }

   public xo a(wy $$0) {
      wy $$1 = !$$0.equals(wy.b(this.c())) ? $$0 : null;
      return new xo(this.d, this.e, this.f, $$1, this.h);
   }

   public xo a() {
      return this.g != null ? new xo(this.d, this.e, this.f, null, this.h) : this;
   }

   public xo a(xc $$0) {
      return this.h.equals($$0) ? this : new xo(this.d, this.e, this.f, this.g, $$0);
   }

   public xo a(boolean $$0) {
      return this.a($$0 ? this.h : xc.c);
   }

   public xo b() {
      xr $$0 = xr.a(this.c());
      xt $$1 = xt.a(this.g());
      return new xo($$1, null, $$0, this.g, this.h);
   }

   public static void a(baa.a $$0, xt $$1, xr $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(bab $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wy d() {
      return Objects.requireNonNullElseGet(this.g, () -> wy.b(this.c()));
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

   public xt k() {
      return this.d;
   }

   @Nullable
   public xk l() {
      return this.e;
   }

   public xr m() {
      return this.f;
   }

   @Nullable
   public wy n() {
      return this.g;
   }

   public xc o() {
      return this.h;
   }
}
