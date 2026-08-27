import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;

@FunctionalInterface
public interface uj {
   Stream<qu> getData(dt var1) throws CommandSyntaxException;
}
