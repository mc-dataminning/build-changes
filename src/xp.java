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

public record xp(xu d, @Nullable xl e, xs f, @Nullable wz g, xd h) {
   public static final MapCodec<xp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xu.a.fieldOf("link").forGetter(xp::k),
               xl.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xs.a.forGetter(xp::m),
               xb.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xd.a.optionalFieldOf("filter_mask", xd.c).forGetter(xp::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xp($$0x, (xl)$$1.orElse(null), $$2, (wz)$$3.orElse(null), $$4))
   );
   private static final UUID i = ad.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xp a(String $$0) {
      return a(i, $$0);
   }

   public static xp a(UUID $$0, String $$1) {
      xs $$2 = xs.a($$1);
      xu $$3 = xu.a($$0);
      return new xp($$3, null, $$2, null, xd.c);
   }

   public xp a(wz $$0) {
      wz $$1 = !$$0.equals(wz.b(this.c())) ? $$0 : null;
      return new xp(this.d, this.e, this.f, $$1, this.h);
   }

   public xp a() {
      return this.g != null ? new xp(this.d, this.e, this.f, null, this.h) : this;
   }

   public xp a(xd $$0) {
      return this.h.equals($$0) ? this : new xp(this.d, this.e, this.f, this.g, $$0);
   }

   public xp a(boolean $$0) {
      return this.a($$0 ? this.h : xd.c);
   }

   public xp b() {
      xs $$0 = xs.a(this.c());
      xu $$1 = xu.a(this.g());
      return new xp($$1, null, $$0, this.g, this.h);
   }

   public static void a(aza.a $$0, xu $$1, xs $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azb $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wz d() {
      return Objects.requireNonNullElseGet(this.g, () -> wz.b(this.c()));
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

   public xu k() {
      return this.d;
   }

   @Nullable
   public xl l() {
      return this.e;
   }

   public xs m() {
      return this.f;
   }

   @Nullable
   public wz n() {
      return this.g;
   }

   public xd o() {
      return this.h;
   }
}
