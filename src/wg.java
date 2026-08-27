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

public record wg(wl d, @Nullable wc e, wj f, @Nullable vq g, vu h) {
   public static final MapCodec<wg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               wl.a.fieldOf("link").forGetter(wg::k),
               wc.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               wj.a.forGetter(wg::m),
               vs.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vu.a.optionalFieldOf("filter_mask", vu.c).forGetter(wg::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new wg($$0x, (wc)$$1.orElse(null), $$2, (vq)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static wg a(String $$0) {
      return a(i, $$0);
   }

   public static wg a(UUID $$0, String $$1) {
      wj $$2 = wj.a($$1);
      wl $$3 = wl.a($$0);
      return new wg($$3, null, $$2, null, vu.c);
   }

   public wg a(vq $$0) {
      vq $$1 = !$$0.equals(vq.b(this.c())) ? $$0 : null;
      return new wg(this.d, this.e, this.f, $$1, this.h);
   }

   public wg a() {
      return this.g != null ? new wg(this.d, this.e, this.f, null, this.h) : this;
   }

   public wg a(vu $$0) {
      return this.h.equals($$0) ? this : new wg(this.d, this.e, this.f, this.g, $$0);
   }

   public wg a(boolean $$0) {
      return this.a($$0 ? this.h : vu.c);
   }

   public wg b() {
      wj $$0 = wj.a(this.c());
      wl $$1 = wl.a(this.g());
      return new wg($$1, null, $$0, this.g, this.h);
   }

   public static void a(awt.a $$0, wl $$1, wj $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(awu $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public vq d() {
      return Objects.requireNonNullElseGet(this.g, () -> vq.b(this.c()));
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

   public wl k() {
      return this.d;
   }

   @Nullable
   public wc l() {
      return this.e;
   }

   public wj m() {
      return this.f;
   }

   @Nullable
   public vq n() {
      return this.g;
   }

   public vu o() {
      return this.h;
   }
}
