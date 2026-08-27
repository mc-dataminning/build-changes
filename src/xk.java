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

public record xk(xp d, @Nullable xg e, xn f, @Nullable wu g, wy h) {
   public static final MapCodec<xk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xp.a.fieldOf("link").forGetter(xk::k),
               xg.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xn.a.forGetter(xk::m),
               ww.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               wy.a.optionalFieldOf("filter_mask", wy.c).forGetter(xk::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xk($$0x, (xg)$$1.orElse(null), $$2, (wu)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xk a(String $$0) {
      return a(i, $$0);
   }

   public static xk a(UUID $$0, String $$1) {
      xn $$2 = xn.a($$1);
      xp $$3 = xp.a($$0);
      return new xk($$3, null, $$2, null, wy.c);
   }

   public xk a(wu $$0) {
      wu $$1 = !$$0.equals(wu.b(this.c())) ? $$0 : null;
      return new xk(this.d, this.e, this.f, $$1, this.h);
   }

   public xk a() {
      return this.g != null ? new xk(this.d, this.e, this.f, null, this.h) : this;
   }

   public xk a(wy $$0) {
      return this.h.equals($$0) ? this : new xk(this.d, this.e, this.f, this.g, $$0);
   }

   public xk a(boolean $$0) {
      return this.a($$0 ? this.h : wy.c);
   }

   public xk b() {
      xn $$0 = xn.a(this.c());
      xp $$1 = xp.a(this.g());
      return new xk($$1, null, $$0, this.g, this.h);
   }

   public static void a(ayk.a $$0, xp $$1, xn $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ayl $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wu d() {
      return Objects.requireNonNullElseGet(this.g, () -> wu.b(this.c()));
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

   public xp k() {
      return this.d;
   }

   @Nullable
   public xg l() {
      return this.e;
   }

   public xn m() {
      return this.f;
   }

   @Nullable
   public wu n() {
      return this.g;
   }

   public wy o() {
      return this.h;
   }
}
