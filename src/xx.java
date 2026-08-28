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

public record xx(yc d, @Nullable xt e, ya f, @Nullable xh g, xl h) {
   public static final MapCodec<xx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yc.a.fieldOf("link").forGetter(xx::k),
               xt.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               ya.a.forGetter(xx::m),
               xj.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xl.a.optionalFieldOf("filter_mask", xl.c).forGetter(xx::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xx($$0x, (xt)$$1.orElse(null), $$2, (xh)$$3.orElse(null), $$4))
   );
   private static final UUID i = ad.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xx a(String $$0) {
      return a(i, $$0);
   }

   public static xx a(UUID $$0, String $$1) {
      ya $$2 = ya.a($$1);
      yc $$3 = yc.a($$0);
      return new xx($$3, null, $$2, null, xl.c);
   }

   public xx a(xh $$0) {
      xh $$1 = !$$0.equals(xh.b(this.c())) ? $$0 : null;
      return new xx(this.d, this.e, this.f, $$1, this.h);
   }

   public xx a() {
      return this.g != null ? new xx(this.d, this.e, this.f, null, this.h) : this;
   }

   public xx a(xl $$0) {
      return this.h.equals($$0) ? this : new xx(this.d, this.e, this.f, this.g, $$0);
   }

   public xx a(boolean $$0) {
      return this.a($$0 ? this.h : xl.c);
   }

   public xx b() {
      ya $$0 = ya.a(this.c());
      yc $$1 = yc.a(this.g());
      return new xx($$1, null, $$0, this.g, this.h);
   }

   public static void a(azv.a $$0, yc $$1, ya $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azw $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xh d() {
      return Objects.requireNonNullElseGet(this.g, () -> xh.b(this.c()));
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

   public yc k() {
      return this.d;
   }

   @Nullable
   public xt l() {
      return this.e;
   }

   public ya m() {
      return this.f;
   }

   @Nullable
   public xh n() {
      return this.g;
   }

   public xl o() {
      return this.h;
   }
}
