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

public record vt(vy d, @Nullable vp e, vw f, @Nullable vd g, vh h) {
   public static final MapCodec<vt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               vy.a.fieldOf("link").forGetter(vt::j),
               vp.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vw.a.forGetter(vt::l),
               vf.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vh.a.optionalFieldOf("filter_mask", vh.c).forGetter(vt::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vt($$0x, (vp)$$1.orElse(null), $$2, (vd)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vt a(String $$0) {
      return a(i, $$0);
   }

   public static vt a(UUID $$0, String $$1) {
      vw $$2 = vw.a($$1);
      vy $$3 = vy.a($$0);
      return new vt($$3, null, $$2, null, vh.c);
   }

   public vt a(vd $$0) {
      vd $$1 = !$$0.equals(vd.b(this.b())) ? $$0 : null;
      return new vt(this.d, this.e, this.f, $$1, this.h);
   }

   public vt a() {
      return this.g != null ? new vt(this.d, this.e, this.f, null, this.h) : this;
   }

   public vt a(vh $$0) {
      return this.h.equals($$0) ? this : new vt(this.d, this.e, this.f, this.g, $$0);
   }

   public vt a(boolean $$0) {
      return this.a($$0 ? this.h : vh.c);
   }

   public static void a(auu.a $$0, vy $$1, vw $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(auv $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public vd c() {
      return Objects.requireNonNullElseGet(this.g, () -> vd.b(this.b()));
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

   public vy j() {
      return this.d;
   }

   @Nullable
   public vp k() {
      return this.e;
   }

   public vw l() {
      return this.f;
   }

   @Nullable
   public vd m() {
      return this.g;
   }

   public vh n() {
      return this.h;
   }
}
