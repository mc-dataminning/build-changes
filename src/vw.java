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

public record vw(wb d, @Nullable vs e, vz f, @Nullable vg g, vk h) {
   public static final MapCodec<vw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               wb.a.fieldOf("link").forGetter(vw::k),
               vs.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vz.a.forGetter(vw::m),
               vi.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vk.a.optionalFieldOf("filter_mask", vk.c).forGetter(vw::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vw($$0x, (vs)$$1.orElse(null), $$2, (vg)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vw a(String $$0) {
      return a(i, $$0);
   }

   public static vw a(UUID $$0, String $$1) {
      vz $$2 = vz.a($$1);
      wb $$3 = wb.a($$0);
      return new vw($$3, null, $$2, null, vk.c);
   }

   public vw a(vg $$0) {
      vg $$1 = !$$0.equals(vg.b(this.c())) ? $$0 : null;
      return new vw(this.d, this.e, this.f, $$1, this.h);
   }

   public vw a() {
      return this.g != null ? new vw(this.d, this.e, this.f, null, this.h) : this;
   }

   public vw a(vk $$0) {
      return this.h.equals($$0) ? this : new vw(this.d, this.e, this.f, this.g, $$0);
   }

   public vw a(boolean $$0) {
      return this.a($$0 ? this.h : vk.c);
   }

   public vw b() {
      vz $$0 = vz.a(this.c());
      wb $$1 = wb.a(this.g());
      return new vw($$1, null, $$0, this.g, this.h);
   }

   public static void a(avc.a $$0, wb $$1, vz $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(avd $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public vg d() {
      return Objects.requireNonNullElseGet(this.g, () -> vg.b(this.c()));
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

   public wb k() {
      return this.d;
   }

   @Nullable
   public vs l() {
      return this.e;
   }

   public vz m() {
      return this.f;
   }

   @Nullable
   public vg n() {
      return this.g;
   }

   public vk o() {
      return this.h;
   }
}
