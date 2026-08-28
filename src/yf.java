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

public record yf(yk d, @Nullable yb e, yi f, @Nullable xp g, xt h) {
   public static final MapCodec<yf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yk.a.fieldOf("link").forGetter(yf::k),
               yb.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yi.a.forGetter(yf::m),
               xr.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xt.a.optionalFieldOf("filter_mask", xt.c).forGetter(yf::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new yf($$0x, (yb)$$1.orElse(null), $$2, (xp)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static yf a(String $$0) {
      return a(i, $$0);
   }

   public static yf a(UUID $$0, String $$1) {
      yi $$2 = yi.a($$1);
      yk $$3 = yk.a($$0);
      return new yf($$3, null, $$2, null, xt.c);
   }

   public yf a(xp $$0) {
      xp $$1 = !$$0.equals(xp.b(this.c())) ? $$0 : null;
      return new yf(this.d, this.e, this.f, $$1, this.h);
   }

   public yf a() {
      return this.g != null ? new yf(this.d, this.e, this.f, null, this.h) : this;
   }

   public yf a(xt $$0) {
      return this.h.equals($$0) ? this : new yf(this.d, this.e, this.f, this.g, $$0);
   }

   public yf a(boolean $$0) {
      return this.a($$0 ? this.h : xt.c);
   }

   public yf b() {
      yi $$0 = yi.a(this.c());
      yk $$1 = yk.a(this.g());
      return new yf($$1, null, $$0, this.g, this.h);
   }

   public static void a(azl.a $$0, yk $$1, yi $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azm $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xp d() {
      return Objects.requireNonNullElseGet(this.g, () -> xp.b(this.c()));
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

   public yk k() {
      return this.d;
   }

   @Nullable
   public yb l() {
      return this.e;
   }

   public yi m() {
      return this.f;
   }

   @Nullable
   public xp n() {
      return this.g;
   }

   public xt o() {
      return this.h;
   }
}
