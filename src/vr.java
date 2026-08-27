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

public record vr(vw d, @Nullable vn e, vu f, @Nullable vb g, vf h) {
   public static final MapCodec<vr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               vw.a.fieldOf("link").forGetter(vr::j),
               vn.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vu.a.forGetter(vr::l),
               vd.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vf.a.optionalFieldOf("filter_mask", vf.c).forGetter(vr::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vr($$0x, (vn)$$1.orElse(null), $$2, (vb)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vr a(String $$0) {
      return a(i, $$0);
   }

   public static vr a(UUID $$0, String $$1) {
      vu $$2 = vu.a($$1);
      vw $$3 = vw.a($$0);
      return new vr($$3, null, $$2, null, vf.c);
   }

   public vr a(vb $$0) {
      vb $$1 = !$$0.equals(vb.b(this.b())) ? $$0 : null;
      return new vr(this.d, this.e, this.f, $$1, this.h);
   }

   public vr a() {
      return this.g != null ? new vr(this.d, this.e, this.f, null, this.h) : this;
   }

   public vr a(vf $$0) {
      return this.h.equals($$0) ? this : new vr(this.d, this.e, this.f, this.g, $$0);
   }

   public vr a(boolean $$0) {
      return this.a($$0 ? this.h : vf.c);
   }

   public static void a(auk.a $$0, vw $$1, vu $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(aul $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public vb c() {
      return Objects.requireNonNullElseGet(this.g, () -> vb.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public vw j() {
      return this.d;
   }

   @Nullable
   public vn k() {
      return this.e;
   }

   public vu l() {
      return this.f;
   }

   @Nullable
   public vb m() {
      return this.g;
   }

   public vf n() {
      return this.h;
   }
}
