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

public record xn(xs d, @Nullable xj e, xq f, @Nullable wx g, xb h) {
   public static final MapCodec<xn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xs.a.fieldOf("link").forGetter(xn::k),
               xj.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xq.a.forGetter(xn::m),
               wz.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xb.a.optionalFieldOf("filter_mask", xb.c).forGetter(xn::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xn($$0x, (xj)$$1.orElse(null), $$2, (wx)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xn a(String $$0) {
      return a(i, $$0);
   }

   public static xn a(UUID $$0, String $$1) {
      xq $$2 = xq.a($$1);
      xs $$3 = xs.a($$0);
      return new xn($$3, null, $$2, null, xb.c);
   }

   public xn a(wx $$0) {
      wx $$1 = !$$0.equals(wx.b(this.c())) ? $$0 : null;
      return new xn(this.d, this.e, this.f, $$1, this.h);
   }

   public xn a() {
      return this.g != null ? new xn(this.d, this.e, this.f, null, this.h) : this;
   }

   public xn a(xb $$0) {
      return this.h.equals($$0) ? this : new xn(this.d, this.e, this.f, this.g, $$0);
   }

   public xn a(boolean $$0) {
      return this.a($$0 ? this.h : xb.c);
   }

   public xn b() {
      xq $$0 = xq.a(this.c());
      xs $$1 = xs.a(this.g());
      return new xn($$1, null, $$0, this.g, this.h);
   }

   public static void a(ayq.a $$0, xs $$1, xq $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ayr $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wx d() {
      return Objects.requireNonNullElseGet(this.g, () -> wx.b(this.c()));
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

   public xs k() {
      return this.d;
   }

   @Nullable
   public xj l() {
      return this.e;
   }

   public xq m() {
      return this.f;
   }

   @Nullable
   public wx n() {
      return this.g;
   }

   public xb o() {
      return this.h;
   }
}
