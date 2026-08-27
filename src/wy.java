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

public record wy(xd d, @Nullable wu e, xb f, @Nullable wi g, wm h) {
   public static final MapCodec<wy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xd.a.fieldOf("link").forGetter(wy::k),
               wu.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xb.a.forGetter(wy::m),
               wk.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               wm.a.optionalFieldOf("filter_mask", wm.c).forGetter(wy::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new wy($$0x, (wu)$$1.orElse(null), $$2, (wi)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static wy a(String $$0) {
      return a(i, $$0);
   }

   public static wy a(UUID $$0, String $$1) {
      xb $$2 = xb.a($$1);
      xd $$3 = xd.a($$0);
      return new wy($$3, null, $$2, null, wm.c);
   }

   public wy a(wi $$0) {
      wi $$1 = !$$0.equals(wi.b(this.c())) ? $$0 : null;
      return new wy(this.d, this.e, this.f, $$1, this.h);
   }

   public wy a() {
      return this.g != null ? new wy(this.d, this.e, this.f, null, this.h) : this;
   }

   public wy a(wm $$0) {
      return this.h.equals($$0) ? this : new wy(this.d, this.e, this.f, this.g, $$0);
   }

   public wy a(boolean $$0) {
      return this.a($$0 ? this.h : wm.c);
   }

   public wy b() {
      xb $$0 = xb.a(this.c());
      xd $$1 = xd.a(this.g());
      return new wy($$1, null, $$0, this.g, this.h);
   }

   public static void a(axx.a $$0, xd $$1, xb $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(axy $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wi d() {
      return Objects.requireNonNullElseGet(this.g, () -> wi.b(this.c()));
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

   public xd k() {
      return this.d;
   }

   @Nullable
   public wu l() {
      return this.e;
   }

   public xb m() {
      return this.f;
   }

   @Nullable
   public wi n() {
      return this.g;
   }

   public wm o() {
      return this.h;
   }
}
