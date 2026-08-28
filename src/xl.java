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

public record xl(xq d, @Nullable xh e, xo f, @Nullable wv g, wz h) {
   public static final MapCodec<xl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xq.a.fieldOf("link").forGetter(xl::k),
               xh.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xo.a.forGetter(xl::m),
               wx.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               wz.a.optionalFieldOf("filter_mask", wz.c).forGetter(xl::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xl($$0x, (xh)$$1.orElse(null), $$2, (wv)$$3.orElse(null), $$4))
   );
   private static final UUID i = af.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xl a(String $$0) {
      return a(i, $$0);
   }

   public static xl a(UUID $$0, String $$1) {
      xo $$2 = xo.a($$1);
      xq $$3 = xq.a($$0);
      return new xl($$3, null, $$2, null, wz.c);
   }

   public xl a(wv $$0) {
      wv $$1 = !$$0.equals(wv.b(this.c())) ? $$0 : null;
      return new xl(this.d, this.e, this.f, $$1, this.h);
   }

   public xl a() {
      return this.g != null ? new xl(this.d, this.e, this.f, null, this.h) : this;
   }

   public xl a(wz $$0) {
      return this.h.equals($$0) ? this : new xl(this.d, this.e, this.f, this.g, $$0);
   }

   public xl a(boolean $$0) {
      return this.a($$0 ? this.h : wz.c);
   }

   public xl b() {
      xo $$0 = xo.a(this.c());
      xq $$1 = xq.a(this.g());
      return new xl($$1, null, $$0, this.g, this.h);
   }

   public static void a(azw.a $$0, xq $$1, xo $$2) throws SignatureException {
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

   public wv d() {
      return Objects.requireNonNullElseGet(this.g, () -> wv.b(this.c()));
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

   public xq k() {
      return this.d;
   }

   @Nullable
   public xh l() {
      return this.e;
   }

   public xo m() {
      return this.f;
   }

   @Nullable
   public wv n() {
      return this.g;
   }

   public wz o() {
      return this.h;
   }
}
