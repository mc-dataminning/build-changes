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

public record xy(yd d, @Nullable xu e, yb f, @Nullable xi g, xm h) {
   public static final MapCodec<xy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yd.a.fieldOf("link").forGetter(xy::k),
               xu.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yb.a.forGetter(xy::m),
               xk.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xm.a.optionalFieldOf("filter_mask", xm.c).forGetter(xy::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xy($$0x, (xu)$$1.orElse(null), $$2, (xi)$$3.orElse(null), $$4))
   );
   private static final UUID i = ae.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xy a(String $$0) {
      return a(i, $$0);
   }

   public static xy a(UUID $$0, String $$1) {
      yb $$2 = yb.a($$1);
      yd $$3 = yd.a($$0);
      return new xy($$3, null, $$2, null, xm.c);
   }

   public xy a(xi $$0) {
      xi $$1 = !$$0.equals(xi.b(this.c())) ? $$0 : null;
      return new xy(this.d, this.e, this.f, $$1, this.h);
   }

   public xy a() {
      return this.g != null ? new xy(this.d, this.e, this.f, null, this.h) : this;
   }

   public xy a(xm $$0) {
      return this.h.equals($$0) ? this : new xy(this.d, this.e, this.f, this.g, $$0);
   }

   public xy a(boolean $$0) {
      return this.a($$0 ? this.h : xm.c);
   }

   public xy b() {
      yb $$0 = yb.a(this.c());
      yd $$1 = yd.a(this.g());
      return new xy($$1, null, $$0, this.g, this.h);
   }

   public static void a(azw.a $$0, yd $$1, yb $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azx $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xi d() {
      return Objects.requireNonNullElseGet(this.g, () -> xi.b(this.c()));
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

   public yd k() {
      return this.d;
   }

   @Nullable
   public xu l() {
      return this.e;
   }

   public yb m() {
      return this.f;
   }

   @Nullable
   public xi n() {
      return this.g;
   }

   public xm o() {
      return this.h;
   }
}
