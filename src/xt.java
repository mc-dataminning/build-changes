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

public record xt(xy d, @Nullable xp e, xw f, @Nullable xd g, xh h) {
   public static final MapCodec<xt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xy.a.fieldOf("link").forGetter(xt::k),
               xp.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xw.a.forGetter(xt::m),
               xf.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xh.a.optionalFieldOf("filter_mask", xh.c).forGetter(xt::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xt($$0x, (xp)$$1.orElse(null), $$2, (xd)$$3.orElse(null), $$4))
   );
   private static final UUID i = ad.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xt a(String $$0) {
      return a(i, $$0);
   }

   public static xt a(UUID $$0, String $$1) {
      xw $$2 = xw.a($$1);
      xy $$3 = xy.a($$0);
      return new xt($$3, null, $$2, null, xh.c);
   }

   public xt a(xd $$0) {
      xd $$1 = !$$0.equals(xd.b(this.c())) ? $$0 : null;
      return new xt(this.d, this.e, this.f, $$1, this.h);
   }

   public xt a() {
      return this.g != null ? new xt(this.d, this.e, this.f, null, this.h) : this;
   }

   public xt a(xh $$0) {
      return this.h.equals($$0) ? this : new xt(this.d, this.e, this.f, this.g, $$0);
   }

   public xt a(boolean $$0) {
      return this.a($$0 ? this.h : xh.c);
   }

   public xt b() {
      xw $$0 = xw.a(this.c());
      xy $$1 = xy.a(this.g());
      return new xt($$1, null, $$0, this.g, this.h);
   }

   public static void a(azo.a $$0, xy $$1, xw $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azp $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xd d() {
      return Objects.requireNonNullElseGet(this.g, () -> xd.b(this.c()));
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

   public xy k() {
      return this.d;
   }

   @Nullable
   public xp l() {
      return this.e;
   }

   public xw m() {
      return this.f;
   }

   @Nullable
   public xd n() {
      return this.g;
   }

   public xh o() {
      return this.h;
   }
}
