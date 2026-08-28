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

public record xq(xv d, @Nullable xm e, xt f, @Nullable xa g, xe h) {
   public static final MapCodec<xq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xv.a.fieldOf("link").forGetter(xq::k),
               xm.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xt.a.forGetter(xq::m),
               xc.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xe.a.optionalFieldOf("filter_mask", xe.c).forGetter(xq::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xq($$0x, (xm)$$1.orElse(null), $$2, (xa)$$3.orElse(null), $$4))
   );
   private static final UUID i = ag.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xq a(String $$0) {
      return a(i, $$0);
   }

   public static xq a(UUID $$0, String $$1) {
      xt $$2 = xt.a($$1);
      xv $$3 = xv.a($$0);
      return new xq($$3, null, $$2, null, xe.c);
   }

   public xq a(xa $$0) {
      xa $$1 = !$$0.equals(xa.b(this.c())) ? $$0 : null;
      return new xq(this.d, this.e, this.f, $$1, this.h);
   }

   public xq a() {
      return this.g != null ? new xq(this.d, this.e, this.f, null, this.h) : this;
   }

   public xq a(xe $$0) {
      return this.h.equals($$0) ? this : new xq(this.d, this.e, this.f, this.g, $$0);
   }

   public xq a(boolean $$0) {
      return this.a($$0 ? this.h : xe.c);
   }

   public xq b() {
      xt $$0 = xt.a(this.c());
      xv $$1 = xv.a(this.g());
      return new xq($$1, null, $$0, this.g, this.h);
   }

   public static void a(bac.a $$0, xv $$1, xt $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(bad $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xa d() {
      return Objects.requireNonNullElseGet(this.g, () -> xa.b(this.c()));
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

   public xv k() {
      return this.d;
   }

   @Nullable
   public xm l() {
      return this.e;
   }

   public xt m() {
      return this.f;
   }

   @Nullable
   public xa n() {
      return this.g;
   }

   public xe o() {
      return this.h;
   }
}
