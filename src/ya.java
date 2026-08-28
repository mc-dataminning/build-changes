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

public record ya(yf d, @Nullable xw e, yd f, @Nullable xk g, xo h) {
   public static final MapCodec<ya> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yf.a.fieldOf("link").forGetter(ya::k),
               xw.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yd.a.forGetter(ya::m),
               xm.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xo.a.optionalFieldOf("filter_mask", xo.c).forGetter(ya::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ya($$0x, (xw)$$1.orElse(null), $$2, (xk)$$3.orElse(null), $$4))
   );
   private static final UUID i = ae.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static ya a(String $$0) {
      return a(i, $$0);
   }

   public static ya a(UUID $$0, String $$1) {
      yd $$2 = yd.a($$1);
      yf $$3 = yf.a($$0);
      return new ya($$3, null, $$2, null, xo.c);
   }

   public ya a(xk $$0) {
      xk $$1 = !$$0.equals(xk.b(this.c())) ? $$0 : null;
      return new ya(this.d, this.e, this.f, $$1, this.h);
   }

   public ya a() {
      return this.g != null ? new ya(this.d, this.e, this.f, null, this.h) : this;
   }

   public ya a(xo $$0) {
      return this.h.equals($$0) ? this : new ya(this.d, this.e, this.f, this.g, $$0);
   }

   public ya a(boolean $$0) {
      return this.a($$0 ? this.h : xo.c);
   }

   public ya b() {
      yd $$0 = yd.a(this.c());
      yf $$1 = yf.a(this.g());
      return new ya($$1, null, $$0, this.g, this.h);
   }

   public static void a(bag.a $$0, yf $$1, yd $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(bah $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xk d() {
      return Objects.requireNonNullElseGet(this.g, () -> xk.b(this.c()));
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

   public yf k() {
      return this.d;
   }

   @Nullable
   public xw l() {
      return this.e;
   }

   public yd m() {
      return this.f;
   }

   @Nullable
   public xk n() {
      return this.g;
   }

   public xo o() {
      return this.h;
   }
}
