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

public record yl(yq d, @Nullable yh e, yo f, @Nullable xv g, xz h) {
   public static final MapCodec<yl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yq.a.fieldOf("link").forGetter(yl::k),
               yh.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yo.a.forGetter(yl::m),
               xx.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xz.a.optionalFieldOf("filter_mask", xz.c).forGetter(yl::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new yl($$0x, (yh)$$1.orElse(null), $$2, (xv)$$3.orElse(null), $$4))
   );
   private static final UUID i = ae.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static yl a(String $$0) {
      return a(i, $$0);
   }

   public static yl a(UUID $$0, String $$1) {
      yo $$2 = yo.a($$1);
      yq $$3 = yq.a($$0);
      return new yl($$3, null, $$2, null, xz.c);
   }

   public yl a(xv $$0) {
      xv $$1 = !$$0.equals(xv.b(this.c())) ? $$0 : null;
      return new yl(this.d, this.e, this.f, $$1, this.h);
   }

   public yl a() {
      return this.g != null ? new yl(this.d, this.e, this.f, null, this.h) : this;
   }

   public yl a(xz $$0) {
      return this.h.equals($$0) ? this : new yl(this.d, this.e, this.f, this.g, $$0);
   }

   public yl a(boolean $$0) {
      return this.a($$0 ? this.h : xz.c);
   }

   public yl b() {
      yo $$0 = yo.a(this.c());
      yq $$1 = yq.a(this.g());
      return new yl($$1, null, $$0, this.g, this.h);
   }

   public static void a(baq.a $$0, yq $$1, yo $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(bar $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xv d() {
      return Objects.requireNonNullElseGet(this.g, () -> xv.b(this.c()));
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

   public yq k() {
      return this.d;
   }

   @Nullable
   public yh l() {
      return this.e;
   }

   public yo m() {
      return this.f;
   }

   @Nullable
   public xv n() {
      return this.g;
   }

   public xz o() {
      return this.h;
   }
}
