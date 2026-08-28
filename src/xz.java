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

public record xz(ye d, @Nullable xv e, yc f, @Nullable xj g, xn h) {
   public static final MapCodec<xz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ye.a.fieldOf("link").forGetter(xz::k),
               xv.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yc.a.forGetter(xz::m),
               xl.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xn.a.optionalFieldOf("filter_mask", xn.c).forGetter(xz::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xz($$0x, (xv)$$1.orElse(null), $$2, (xj)$$3.orElse(null), $$4))
   );
   private static final UUID i = ae.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xz a(String $$0) {
      return a(i, $$0);
   }

   public static xz a(UUID $$0, String $$1) {
      yc $$2 = yc.a($$1);
      ye $$3 = ye.a($$0);
      return new xz($$3, null, $$2, null, xn.c);
   }

   public xz a(xj $$0) {
      xj $$1 = !$$0.equals(xj.b(this.c())) ? $$0 : null;
      return new xz(this.d, this.e, this.f, $$1, this.h);
   }

   public xz a() {
      return this.g != null ? new xz(this.d, this.e, this.f, null, this.h) : this;
   }

   public xz a(xn $$0) {
      return this.h.equals($$0) ? this : new xz(this.d, this.e, this.f, this.g, $$0);
   }

   public xz a(boolean $$0) {
      return this.a($$0 ? this.h : xn.c);
   }

   public xz b() {
      yc $$0 = yc.a(this.c());
      ye $$1 = ye.a(this.g());
      return new xz($$1, null, $$0, this.g, this.h);
   }

   public static void a(azy.a $$0, ye $$1, yc $$2) throws SignatureException {
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

   public xj d() {
      return Objects.requireNonNullElseGet(this.g, () -> xj.b(this.c()));
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

   public ye k() {
      return this.d;
   }

   @Nullable
   public xv l() {
      return this.e;
   }

   public yc m() {
      return this.f;
   }

   @Nullable
   public xj n() {
      return this.g;
   }

   public xn o() {
      return this.h;
   }
}
