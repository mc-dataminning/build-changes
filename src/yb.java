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

public record yb(yg d, @Nullable xx e, ye f, @Nullable xl g, xp h) {
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yg.a.fieldOf("link").forGetter(yb::k),
               xx.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               ye.a.forGetter(yb::m),
               xn.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xp.a.optionalFieldOf("filter_mask", xp.c).forGetter(yb::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new yb($$0x, (xx)$$1.orElse(null), $$2, (xl)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static yb a(String $$0) {
      return a(i, $$0);
   }

   public static yb a(UUID $$0, String $$1) {
      ye $$2 = ye.a($$1);
      yg $$3 = yg.a($$0);
      return new yb($$3, null, $$2, null, xp.c);
   }

   public yb a(xl $$0) {
      xl $$1 = !$$0.equals(xl.b(this.c())) ? $$0 : null;
      return new yb(this.d, this.e, this.f, $$1, this.h);
   }

   public yb a() {
      return this.g != null ? new yb(this.d, this.e, this.f, null, this.h) : this;
   }

   public yb a(xp $$0) {
      return this.h.equals($$0) ? this : new yb(this.d, this.e, this.f, this.g, $$0);
   }

   public yb a(boolean $$0) {
      return this.a($$0 ? this.h : xp.c);
   }

   public yb b() {
      ye $$0 = ye.a(this.c());
      yg $$1 = yg.a(this.g());
      return new yb($$1, null, $$0, this.g, this.h);
   }

   public static void a(azg.a $$0, yg $$1, ye $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azh $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xl d() {
      return Objects.requireNonNullElseGet(this.g, () -> xl.b(this.c()));
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

   public yg k() {
      return this.d;
   }

   @Nullable
   public xx l() {
      return this.e;
   }

   public ye m() {
      return this.f;
   }

   @Nullable
   public xl n() {
      return this.g;
   }

   public xp o() {
      return this.h;
   }
}
