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

public record ww(xb d, @Nullable ws e, wz f, @Nullable wg g, wk h) {
   public static final MapCodec<ww> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xb.a.fieldOf("link").forGetter(ww::k),
               ws.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               wz.a.forGetter(ww::m),
               wi.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               wk.a.optionalFieldOf("filter_mask", wk.c).forGetter(ww::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ww($$0x, (ws)$$1.orElse(null), $$2, (wg)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static ww a(String $$0) {
      return a(i, $$0);
   }

   public static ww a(UUID $$0, String $$1) {
      wz $$2 = wz.a($$1);
      xb $$3 = xb.a($$0);
      return new ww($$3, null, $$2, null, wk.c);
   }

   public ww a(wg $$0) {
      wg $$1 = !$$0.equals(wg.b(this.c())) ? $$0 : null;
      return new ww(this.d, this.e, this.f, $$1, this.h);
   }

   public ww a() {
      return this.g != null ? new ww(this.d, this.e, this.f, null, this.h) : this;
   }

   public ww a(wk $$0) {
      return this.h.equals($$0) ? this : new ww(this.d, this.e, this.f, this.g, $$0);
   }

   public ww a(boolean $$0) {
      return this.a($$0 ? this.h : wk.c);
   }

   public ww b() {
      wz $$0 = wz.a(this.c());
      xb $$1 = xb.a(this.g());
      return new ww($$1, null, $$0, this.g, this.h);
   }

   public static void a(axv.a $$0, xb $$1, wz $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(axw $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wg d() {
      return Objects.requireNonNullElseGet(this.g, () -> wg.b(this.c()));
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

   public xb k() {
      return this.d;
   }

   @Nullable
   public ws l() {
      return this.e;
   }

   public wz m() {
      return this.f;
   }

   @Nullable
   public wg n() {
      return this.g;
   }

   public wk o() {
      return this.h;
   }
}
